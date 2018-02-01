package com.ridango.train.train.dao;

import com.ridango.train.train.model.Train;

import java.util.List;
import java.util.UUID;

public interface TrainDAO {

    List<Train> selectAllTrains();

    Train selectTrainById(UUID trainId);

    int updateTrainStatus(Train train);

    int deleteTrainById(UUID trainId);

    int insertNewTrain(UUID trainId, Train train);
}
