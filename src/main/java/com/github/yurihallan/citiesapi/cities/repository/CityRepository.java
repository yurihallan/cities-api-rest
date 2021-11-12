package com.github.yurihallan.citiesapi.cities.repository;

import com.github.yurihallan.citiesapi.cities.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CityRepository extends JpaRepository<City, Long> {
    @Query(value = "SELECT ((SELECT lat_lon FROM cidade WHERE id=?1) <@> (SELECT lat_lon FROM cidade WHERE id=?2)) as distance", nativeQuery = true)
    Double distanceByPoints(final Long cityId1, final Long cityId2);

    @Query(value = "select earth_distance(\n" +
            "    ll_to_earth(?1,?2), \n" +
            "    ll_to_earth(?3,?4)\n" +
            ") as distance", nativeQuery = true)
    Double distanceByCube(final double lat1,final double lon1, double lat2, double lon2);
}
