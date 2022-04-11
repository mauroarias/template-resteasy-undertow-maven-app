package org.mauro.templateapp.config;

import jakarta.ws.rs.ext.Provider;

@Provider
class MapperConfig {//implements ContextResolver<ObjectMapper> {
//
//    private ObjectMapper mapper;
//
//    @Override
//    public ObjectMapper getContext(Class<?> type) {
//        if (mapper == null) {
//            mapper = getMapper();
//        }
//        return mapper;
//    }
//
//    private ObjectMapper getMapper() {
//        final ObjectMapper mapper = new ObjectMapper();
//        mapper.setPropertyNamingStrategy(LOWER_CAMEL_CASE);
//        mapper.setSerializationInclusion(NON_NULL);
//        mapper.disable(FAIL_ON_UNKNOWN_PROPERTIES);
//        mapper.disable(WRITE_DATES_AS_TIMESTAMPS);
//        mapper.registerModule(new JavaTimeModule());
//        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ"));
//        mapper.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
//        return mapper;
//    }
}
