package com.example.equeue_client.api.fuel_queue;

import com.example.equeue_client.models.fuel_queue.FuelQueueRequest;
import com.example.equeue_client.models.fuel_queue.FuelQueueResponse;



import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface IFuelQueueApi {

    /***
     * creates a new fuel queue in database
     * @param request = FuelQueueRequest object
     * @return = FuelQueueResponse object
     */
    @POST("/api/FuelQueue")
    Call<FuelQueueResponse> createFuelQueue(@Body FuelQueueRequest request);

    /***
     * Add a new user to the fuel Queue
     * @param FuelStationID = Id of the fuel station
     * @param request = FuelQueueRequest object
     * @return = a boolean value
     */
    @POST("/api/FuelQueue/join/{id}")
    Call<Boolean> AddUserFuelQueue(@Path("id") String FuelStationID, @Body FuelQueueRequest request);




}
