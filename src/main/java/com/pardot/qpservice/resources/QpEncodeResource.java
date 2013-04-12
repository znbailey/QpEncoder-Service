package com.pardot.qpservice.resources;

import java.io.UnsupportedEncodingException;

import javax.mail.internet.MimeUtility;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.common.base.Charsets;
import com.yammer.metrics.annotation.Timed;

@Path("/encode")
@Produces(MediaType.APPLICATION_JSON)
public class QpEncodeResource {
    
    @POST
    @Timed
    public Response encode(@FormParam("raw") String raw) throws UnsupportedEncodingException {
        String encoded = MimeUtility.encodeText(raw, Charsets.UTF_8.toString(), "Q");
        return Response.ok(encoded, "text/plain").build();
    }
}
