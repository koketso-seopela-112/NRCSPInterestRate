<!-- header styles -->

<?php
   $localFonts = apply_filters('get_local_fonts', '');
?>
<?php if ($localFonts) : ?> 
   <link rel="stylesheet" href="<?php echo get_template_directory_uri(); ?>/css/<?php echo $localFonts; ?>" media="screen" type="text/css" />
<?php else : ?>
   <?php endif; ?>

<style>.u-header {
  background-image: none;
}
.u-header .u-sheet-1 {
  min-height: 80px;
}
.u-header .u-image-1 {
  margin: 22px auto 0 0;
}
.u-header .u-logo-image-1 {
  max-width: 64px;
  max-height: 64px;
}
.u-header .u-menu-1 {
  margin: -32px 0 22px auto;
}
.u-header .u-nav-1 {
  font-size: 1rem;
  letter-spacing: 0px;
  font-weight: 500;
}
.u-block-c2f7-19 {
  box-shadow: 2px 2px 8px 0 rgba(128,128,128,1);
}
.u-header .u-nav-2 {
  font-size: 1.25rem;
}
.u-block-c2f7-20 {
  box-shadow: 2px 2px 8px 0 rgba(128,128,128,1);
}
@media (max-width: 1199px) {
  .u-header .u-image-1 {
    width: 64px;
    height: 32px;
  }
  .u-header .u-menu-1 {
    width: auto;
  }
}
@media (max-width: 767px) {
  .u-header .u-image-1 {
    width: auto;
  }
}</style>
