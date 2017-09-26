angular.module('mainModule').controller('StudentController', function($scope, $http,$window){

	
	//$scope.students = [];

	$scope.getStudents = function() {
		$http.get('http://localhost:1414/student/all').then(function(data) {
			$scope.students = data.data;
		});
	};

	$scope.addStudent = function() {
		$http.post('http://localhost:1414/student/new', 
			{
				primer_nombre: $scope.primer_nombre,
				apellido: $scope.apellido,
				rut: $scope.rut,
				carrera: $scope.carrera,
				email: $scope.email,
				anio_ingreso: $scope.anio_ingreso
			}
		).then(function(data) {
			$scope.msg = 'Estudiante Creado Correctamente';
			$scope.getStudents();
		}).catch(function(data) {
			$scope.msg = 'Se ha producido un error';
		});

		$window.location.reload();
	};

});



/*angular.module('librosApp', []).controller('TodosLosLibrosCtrl', function ($scope) {
    $scope.libros = [
        {'titulo': 'The design of every day things', 'autor': 'Don Norman'},
        {'titulo': 'El nombre del viento', 'autor': 'Patrik Rufus'},
        {'titulo': 'Game of Thrones', 'autor': 'R.R. Martin'}
    ];
});*/