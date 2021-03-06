package gw2api.api.recipes;

import com.sun.jersey.api.client.WebResource;

import gw2api.util.rest.IdsResourceBase;
import gw2api.util.rest.RequestHelper;

public class RecipesResourceImpl extends IdsResourceBase<Recipe, int[]> implements RecipesResource {
    private final WebResource searchWebResource;

    public RecipesResourceImpl(WebResource webResource) {
        super(webResource.path("recipes"), Recipe.class, int[].class);
        searchWebResource = this.webResource.path("search");
    }

    @Override
    public int[] searchByInput(int id) {
        return RequestHelper.INSTANCE.getRequest(searchWebResource, int[].class, "input", String.valueOf(id));
    }

    @Override
    public int[] searchByOutput(int id) {
        return RequestHelper.INSTANCE.getRequest(searchWebResource, int[].class, "output", String.valueOf(id));
    }
}
