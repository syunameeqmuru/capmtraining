sap.ui.define(
		["sap/ui/core/mvc/Controller",
		 "jquery.sap.global"],
		function(Controller, jQuery){
	return Controller.extend("anubhav.controller.Main",{
		onLoadData: function(){
			//alert("todo: we will call our microservice to load vendors");
			jQuery.ajax("/newVendor",{
				type: 'GET',
				success: function(data){
					console.log(data);
				},
				error: function(err){
					
				}
			});
		}
	});
});