package ar.edu.undec.elasticadapter.persistence.repoimplementation;

import ar.edu.undec.elasticadapter.persistence.crud.IAverageDistanceCRUD;
import ar.edu.undec.elasticadapter.persistence.datamodel.AccidentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import repository.IAverageDistanceRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class AverageDistanceRepoImplementation implements IAverageDistanceRepository {


    @Autowired
    IAverageDistanceCRUD averageDistanceCRUD;

    @Override
    public Double queryAverageDistance() {
        Stream<AccidentEntity> retrieved = averageDistanceCRUD.getEndLatNotNull();

        Double conteo = retrieved.mapToDouble(accidentEntity ->
        {
            try {
                return distance(accidentEntity.getStartLng(), accidentEntity.getStartLat(), accidentEntity.getEndLng(), accidentEntity.getEndLat(), "K");
            } catch (NumberFormatException e) {
                return 0.0;
            }
        }).average()
        .orElse(Double.valueOf(0));

        return conteo ;

    }

    private static double distance(double longitude1, double latitude1, double longitude2, double latitude2, String unit) {
        if ((latitude1 == latitude2) && (longitude1 == longitude2)) {
            return 0;
        } else {
            double theta = longitude1 - longitude2;
            double dist = Math.sin(Math.toRadians(latitude1)) * Math.sin(Math.toRadians(latitude2)) + Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(latitude2)) * Math.cos(Math.toRadians(theta));
            dist = Math.acos(dist);
            dist = Math.toDegrees(dist);
            dist = dist * 60 * 1.1515;
            if (unit.equals("K")) {
                dist = dist * 1.609344;
            } else if (unit.equals("N")) {
                dist = dist * 0.8684;
            }
            return (dist);
        }
    }
}
