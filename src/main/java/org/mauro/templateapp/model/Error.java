package org.mauro.templateapp.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Error {
	String message;
}
