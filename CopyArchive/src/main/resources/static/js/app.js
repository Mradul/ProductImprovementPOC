var app= angular.module("copyArchive",['ngResource','ui.grid']);
app.controller('stateController',['$scope','stateService','infosetColumnsService',
                                  function($scope,stateService,infosetColumnsService){
    $scope.selectedState= stateService.selectedState;
    $scope.states=stateService.listOfStates;
   
    //
   $scope.setState=function(){
	   //stateService.selectedState=$scope.selectedStateId;
	   stateService.setStateForSession($scope.selectedStateId);
   };
   $scope.loadColumns=function(infosetId){
	   console.log("get columns");
	   
	   $scope.gridOptions={
			   data : infosetColumnsService.res.query({id:infosetId}),
			   columnDefs : [
			                 {field: 'clarifications', visible: false},
			                 {field: 'cleanUpDiagrame', visible: false },
			                 {field: 'decription', visible: false },
			                 {field: 'linkColumn1', visible: false },
			                 {field: 'linkColumn2', visible: false },
			                 {field: 'linkColumn3', visible: false },
			                 {field: 'linkColumn4', visible: false },
			                 {field: 'linkColumn5', visible: false },
			                 {field: 'tableName', visible: false },
			                 {field: 'infoset', visible: false },
			                 ]

	   };
	   $scope.columns=infosetColumnsService.res.query({id:infosetId});
	   
   };
   
}]);
app.service('stateService',['$resource',function($resource){
	this.selectedState=1;
	var res=$resource('http://localhost:8080/State/list');
	this.listOfStates=  res.query();
	console.log(this.listOfStates);
	
	this.setStateForSession=function(selectedStateId){
		this.selectedState=selectedStateId;
		res=$resource('http://localhost:8080/State/set/'+selectedStateId);
		res.save();
	};
}]);

app.service('infosetColumnsService',['$resource',function($resource){
	this.res=$resource('/InfosetColumn/infoset/:id');
	
	
}]);