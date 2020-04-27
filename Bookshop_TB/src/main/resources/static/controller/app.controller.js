sap.ui.define([
	"sap/ui/core/mvc/Controller",
	"sap/m/MessageToast",
	"sap/ui/model/json/JSONModel"
], function (Controller, MessageToast, JSONModel) {
	"use strict";

	return Controller.extend("com.sap.bookstoreTA.com.sap.bookstoreTA.controller.app", {
		onInit: function () {

		},
		onItemPress : function(oEvent)
		{
			var oSource = oEvent.getSource(),
			oListItemData = oSource.getBindingContext().getObject();
			var oRouter = sap.ui.core.UIComponent.getRouterFor(this);
			oRouter.navTo("detail",{
				"isbn":oListItemData.Isbn
			});
			//MessageToast.show("Book: " + oListItemData.Isbn + "Has been pressed")
		}
	});
});