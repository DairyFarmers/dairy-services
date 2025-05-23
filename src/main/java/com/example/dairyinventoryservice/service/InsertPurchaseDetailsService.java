package com.example.dairyinventoryservice.service;

import com.example.dairyinventoryservice.dto.request.*;
import com.example.dairyinventoryservice.dto.response.GeneralResponse;


public interface InsertPurchaseDetailsService {

    public GeneralResponse addNewUser(InsertUserDto insertUserDto);

    public GeneralResponse updateUser(UpdateUserDto updateUserDto);

    public GeneralResponse addLocation(LocationDto locationDto);

    public GeneralResponse addUserRole(UserRoleDto userRoleDto);

    public GeneralResponse addItem(ItemsDetailsDto itemDto);

    public GeneralResponse addPurchaseDetails(PurchaseDetailDto insertPurchase);

    public GeneralResponse addNewSalesDetails(SalesDetailsDto insertSalesDetails);

}
