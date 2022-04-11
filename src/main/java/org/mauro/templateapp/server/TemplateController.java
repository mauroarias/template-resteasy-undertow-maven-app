package org.mauro.templateapp.server;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import lombok.extern.slf4j.Slf4j;
import org.mauro.templateapp.model.Entry;
import org.mauro.templateapp.model.Status;
import org.mauro.templateapp.service.TemplateService;

import java.util.List;

@Slf4j
@Path("/template")
public class TemplateController {

	private TemplateService templateService = new TemplateService();

	@GET
	@Path("/ping")
	@Produces("application/json")
	public Status ping() {
		return templateService.ping();
	}

	@GET
	@Path("/entry/{name]")
	@Produces("application/json")
	public Entry getEntry(final @PathParam("name") String name) {
		return templateService.getEntry(name);
	}

	@GET
	@Path("/entry")
	@Produces("application/json")
	public List<Entry> getEntry() {
		return templateService.getAll();
	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/entry")
	public Entry createEntry(String name) {
		return templateService.createEntry(name);
	}
}
