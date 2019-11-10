function getSourceCanvas(image, data) {
    var canvas = $('<canvas>')[0],
        context = canvas.getContext('2d'),
        width = data.naturalWidth,
        height = data.naturalHeight,
        rotate = data.rotate,
        rotated = getRotatedSizes({
            width: width,
            height: height,
            degree: rotate
        });

    if (rotate) {
        canvas.width = rotated.width;
        canvas.height = rotated.height;
        context.save();
        context.translate(rotated.width / 2, rotated.height / 2);
        context.rotate(rotate * Math.PI / 180);
        context.drawImage(image, -width / 2, -height / 2, width, height);
        context.restore();
    } else {
        canvas.width = width;
        canvas.height = height;
        context.drawImage(image, 0, 0, width, height);
    }

    return canvas;
}

function loadPicture(){
    prototype.load = function (url) {
        var options = this.options,
            $this = this.$element,
            crossOrigin,
            bustCacheUrl,
            buildEvent,
            $clone;

        if (!url) {
            if ($this.is('img')) {
                if (!$this.attr('src')) {
                    return;
                }

                url = $this.prop('src');
            } else if ($this.is('canvas') && SUPPORT_CANVAS) {
                url = $this[0].toDataURL();
            }
        }

        if (!url) {
            return;
        }

        buildEvent = $.Event(EVENT_BUILD);
        $this.one(EVENT_BUILD, options.build).trigger(buildEvent); // Only trigger once

        if (buildEvent.isDefaultPrevented()) {
            return;
        }

        if (options.checkImageOrigin && isCrossOriginURL(url)) {
            crossOrigin = 'anonymous';

            if (!$this.prop('crossOrigin')) { // Only when there was not a "crossOrigin" property
                bustCacheUrl = addTimestamp(url); // Bust cache (#148)
            }
        }

        this.$clone = $clone = $('<img>');

        $clone.one('load', $.proxy(function () {
            var naturalWidth = $clone.prop('naturalWidth') || $clone.width(),
                naturalHeight = $clone.prop('naturalHeight') || $clone.height();

            this.image = {
                naturalWidth: naturalWidth,
                naturalHeight: naturalHeight,
                aspectRatio: naturalWidth / naturalHeight,
                rotate: 0
            };

            this.url = url;
            this.ready = true;
            this.build();
        }, this)).one('error', function () {
            $clone.remove();
        }).attr({
            src: bustCacheUrl || url,
            crossOrigin: crossOrigin
        });

        // Hide and insert into the document
        $clone.addClass(CLASS_HIDE).insertAfter($this);
    };
}