package org.mauro.templateapp.model;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class Entry {
    UUID id;
    String name;
}
