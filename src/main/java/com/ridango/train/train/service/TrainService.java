package com.ridango.train.train.service;

import com.ridango.train.train.dao.FakeDB;
import com.ridango.train.train.model.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TrainService {

    private FakeDB fakeDB;

    @Autowired
    public TrainService(FakeDB fakeDB) {
        this.fakeDB = fakeDB;
    }

    public List<Train> getAllTrains(){
        return fakeDB.selectAllTrains();
    }

    public Train getTrainById(UUID trainId){
        return fakeDB.selectTrainById(trainId);
    }

    public int deleteTrainById(UUID trainId){
        return fakeDB.deleteTrainById(trainId);
    }

    public int updateTrain(Train train){
        if (!train.getTrainID().equals(null)){
            return fakeDB.updateTrainStatus(train);
        }
        throw  new NullPointerException("train " + train.getTrainID() + " was not found.");
    }

    public int insertTrain(Train train){
        UUID trainId = UUID.randomUUID();

        return fakeDB.insertNewTrain(trainId, Train.newTrain(trainId, train));
    }
}
