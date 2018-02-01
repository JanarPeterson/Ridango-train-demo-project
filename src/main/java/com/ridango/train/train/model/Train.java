package com.ridango.train.train.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.UUID;

public class Train {

    private final UUID trainID;

    @NotNull
    private final String cargo;

    @NotNull
    private final String startPoint;

    @NotNull
    private final String endPoint;

    public Train(
            @JsonProperty("trainID") UUID trainID,
            @JsonProperty("cargo") String cargo,
            @JsonProperty("startPoint") String startPoint,
            @JsonProperty("endPoint") String endPoint) {
        this.trainID = trainID;
        this.cargo = cargo;
        this.startPoint =  startPoint;
        this.endPoint  = endPoint;
    }

    public UUID getTrainID() {
        return trainID;
    }

    public String getCargo() {
        return cargo;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public static Train newTrain(UUID trainID, Train train){
        return new Train(trainID, train.getCargo(), train.getStartPoint(), train.getEndPoint());
    }
}
