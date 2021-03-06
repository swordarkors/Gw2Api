package gw2api.api.continents.floors.regions.maps;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class PointOfInterest {
    private int id;
    private String name;
    private String type;
    private float[] coord;
}
