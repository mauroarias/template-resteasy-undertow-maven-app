package org.mauro.templateapp.server;

public final class HandlerException {

//	//Monitoring Bad parameter arguments
//	@ExceptionHandler(MonitoringBadParametersException.class)
//	public ResponseEntity handlerBadParametersException(final MonitoringBadParametersException ex) {
//		return new ResponseEntity<>(Error
//										.builder()
//										.errorType(ex.getErrorType())
//										.exceptionType(ex.getClass().getCanonicalName())
//										.message(ex.getMessage())
//										.build(),
//									BAD_REQUEST);
//	}
//
//	//unknowns exceptions
//	@ExceptionHandler(Exception.class)
//	public ResponseEntity handlerException(Exception ex) {
//		return new ResponseEntity<>(Error
//										.builder()
//										.errorType(ErrorType.UNKNOWN_ERROR)
//										.exceptionType(ex.getClass().getCanonicalName())
//										.message(ex.getMessage())
//										.build(),
//									INTERNAL_SERVER_ERROR);
//	}
}
