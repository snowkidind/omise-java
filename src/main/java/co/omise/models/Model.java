package co.omise.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

public abstract class Model {
    private String object;
    private String id;
    @JsonProperty("livemode")
    private boolean liveMode;
    private String location;
    @JsonProperty("created")
    private DateTime created;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private boolean deleted;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isLiveMode() {
        return liveMode;
    }

    public void setLiveMode(boolean liveMode) {
        this.liveMode = liveMode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public DateTime getCreated() {
        return created;
    }

    public void setCreated(DateTime created) {
        this.created = created;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
