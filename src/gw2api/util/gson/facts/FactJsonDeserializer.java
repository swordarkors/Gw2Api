package gw2api.util.gson.facts;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import gw2api.api.traits.Fact;
import gw2api.api.traits.FactType;

public class FactJsonDeserializer implements JsonDeserializer<Fact> {
    @Override
    public Fact deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject parent = (JsonObject) json;
        FactType type = context.deserialize(parent.get("type"), FactType.class);
        return context.deserialize(json, type.getTypeClass());
    }
}
