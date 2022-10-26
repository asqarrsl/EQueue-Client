package com.example.equeue_client.api.auth;

import com.example.equeue_client.models.user.UserRequest;
import com.example.equeue_client.models.user.UserResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IAuthApi {
    /***
     * creates a new user in database
     * @param user = UserRequest object
     * @return = UserResponse object
     */
    @POST("/api/User")
    Call<UserResponse> registerUser(@Body UserRequest user);

    /***
     * validate user using user details
     * @param user = UserRequest object
     * @return = UserResponse object
     */
    @POST("/api/User/login")
    Call<UserResponse> loginUser(@Body UserRequest user);
}
