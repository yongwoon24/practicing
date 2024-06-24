$(function (){
    $('.slideshow').each(function(){
        let $imgs = $(this).find('img');
        let imgCount = $imgs.length;
        let currentIndex = 0;
        $imgs.eq(currentIndex).fadeIn();

        setInterval(function(){
            let nextIndex = (currentIndex + 1) % imgCount;

            currentIndex = nextIndex;
        }, 5000);
    });

});