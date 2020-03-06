$(document).ready(function(){
    $(".fas fa-chevron-left").on('click', function(event) {
      if (this.hash !== "") {
        event.preventDefault();
        var hash = this.hash;

        if($(hash).is(':hidden')){
          $('.registrationForm').hide();
          $('#pricing').hide();
          $(hash).show(500);
        }

        $('html, body').animate({
          scrollTop: $(hash).offset().top-60
        }, 800, function(){});
      }
    });

    $('.registrationForm').hide();
    $('#pricing').hide();
