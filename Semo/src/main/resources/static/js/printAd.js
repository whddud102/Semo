function printAd(list) {
		var gallery = $("#gallery");
		
		var str = "";
		
		for(var i=0; i<list.length; i++) {
		    var ad = list[i];
		    
		    console.log(ad);
		    
		    
			str +=	'<div class="col one_fourth gallery_box">';
			str += '<div class="img_frame img_frame_14 img_nom">';
			str += 	'<span></span>';
			str +=	'<iframe width="205" height="110" src="' + ad.ad_url + '" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>';
			str += '</div>';
			str += '<h4>' + ad.ad_name + '</h4>';
			str += '<p>' + ad.search_HashTag + '</p>';
			str += '<a href="#" class="more">DETAIL</a></div>';
	}
		
	gallery.html(str);


};