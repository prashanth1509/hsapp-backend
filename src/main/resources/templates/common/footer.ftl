<div class="hsapp-footer">
</div>

<script type="text/javascript">
$( document ).ready( function(){
    var model = ${modelJSON};
    $.each(DRE, function(k, v){
        v.init(model);
    });
});
</script>

</body>
</html>