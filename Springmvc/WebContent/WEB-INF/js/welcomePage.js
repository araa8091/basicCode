
function myFun(){
	var req = new XMLHttpRequest();
	req.open('GET','welcomePage.jsp',true);
	req.send();
	
	req.onreadystatechange = function(){
		if(req.readyState == 4 && req.status == 200){
			document.getElementById('loaddata').innerHTML = req.responseText;
		}
	}
}
































/*function stringLength() {
	$.ajax({
        headers : {
        Accept : "application/json; charset=utf-8"
        },
       type : "get",
       url : "getcoll",
       contentType : "application/json; charset=utf-8",
      	dataType : "json",
      	data : defnId,
       success : function(length) {
       	fillData(length);
       },
       error : function(returnData) {
       	$('#successmodal').modal('show');
			$('.heading').text('Error');
			$('#successp').text('Error Bringing Data!');
	 		$('#iconid').removeClass('fa-check').addClass('fa-ban');
       }
});
}*/

/*$(document).ready(function() {
$('#addToTable').on('click', function() {
	validateInputsForTable();
});
stringLength();
});*/

