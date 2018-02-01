package com.ridango.train.train.dao;

import com.ridango.train.train.model.Train;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;
import java.util.*;

@Repository
public class FakeDB implements TrainDAO {

    private static Map<UUID, Train> dataBase;

    public FakeDB() {
        dataBase = new HashMap<>();
        UUID trainId = UUID.randomUUID();
        dataBase.put(trainId, new Train(trainId, "people", "Tallinn", "Türi"));
    }

    @Override
    public List<Train> selectAllTrains() {
        return new ArrayList<>(dataBase.values());
    }

    @Override
    public Train selectTrainById(UUID trainId) {
        return dataBase.get(trainId);
    }

    @Override
    public int updateTrainStatus(Train train) {
        dataBase.put(train.getTrainID(), train);
        return 1;
    }

    @Override
    public int deleteTrainById(UUID trainId) {
        dataBase.remove(trainId);
        return 1;
    }

    @Override
    public int insertNewTrain(UUID trainId,Train train) {
        dataBase.put(trainId, train);
        return 1;
    }
}
