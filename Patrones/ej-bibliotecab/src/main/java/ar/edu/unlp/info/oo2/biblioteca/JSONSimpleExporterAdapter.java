package ar.edu.unlp.info.oo2.biblioteca;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.List;

// Adapter para JSON.simple
public class JSONSimpleExporterAdapter extends VoorheesExporter {

    @Override
    public String exportar(List<Socio> socios) {
        JSONArray jsonArray = new JSONArray();

        for (Socio socio : socios) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("nombre", socio.getNombre());
            jsonObject.put("email", socio.getEmail());
            jsonObject.put("legajo", socio.getLegajo());
            jsonArray.add(jsonObject);
        }

        return jsonArray.toJSONString();
    }
}

/*
 * Cuando tengo que usar el Adapter tengo que hacer una clase 
 * intermedia entre la clase que lo debe implementar y la clase que se 
 * quiere implementar en el codigo de alguna manera 
 * */
