package com.ridango.train.train.controller;

import com.ridango.train.train.model.Train;
import com.ridango.train.train.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController()
@RequestMapping(
        path = "/trains/"
)
public class TrainController {

    private TrainService trainService;

    @Autowired
    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }

    @RequestMapping(
    method = RequestMethod.GET,
    produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Train> showAllTrains(){
        return trainService.getAllTrains();
    }

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            path = "{trainId}"
    )
    public Train getTrainById(@PathVariable("trainId")UUID trainId){
        return trainService.getTrainById(trainId);
    }


    @RequestMapping(
            method = RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public int updateTrainStatus(@RequestBody Train train){
        return trainService.updateTrain(train);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE,
            path = "{trainId}"
    )
    public int removeTrainById(@PathVariable("trainId")UUID trainId){
        return trainService.deleteTrainById(trainId);
    }

    @RequestMapping(
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public int insertTrain(@RequestBody Train train){
        return trainService.insertTrain(train);
    }

}
