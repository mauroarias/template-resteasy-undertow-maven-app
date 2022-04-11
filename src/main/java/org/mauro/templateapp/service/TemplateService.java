package org.mauro.templateapp.service;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.extern.slf4j.Slf4j;
import org.mauro.templateapp.model.Entry;
import org.mauro.templateapp.model.Status;
import org.mauro.templateapp.model.exception.NotFoundException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@ApplicationScoped
public final class TemplateService {

	Map<String, Entry> entries = new HashMap<>();

	public Status ping() {
		log.debug("calling debug");
		return Status.builder().value("PONG").build();
	}

	public Entry createEntry(final String name) {
		final Entry entry = Entry.builder().id(UUID.randomUUID()).name(name).build();
		entries.put(name, entry);
		return entry;
	}

	public List<Entry> getAll() {
		return entries.values().stream().parallel().collect(Collectors.toList());
	}

	public Entry getEntry(final String name) {
		final Entry entry = entries.get(name);
		if (entry == null) {
			throw new NotFoundException();
		}
		return entry;
	}
}
