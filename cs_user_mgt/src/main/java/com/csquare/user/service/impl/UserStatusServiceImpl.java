package com.csquare.user.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csquare.user.dao.UserStatusRepository;
import com.csquare.user.model.UserStatus;
import com.csquare.user.service.IUserStatusService;


@Service
public class UserStatusServiceImpl implements IUserStatusService {

    @Autowired
    UserStatusRepository iUserStatusRepository;

    @Override
    public UserStatus addUserStatus(UserStatus UserStatus) {

        // TODO Auto-generated method stub
        iUserStatusRepository.create(UserStatus);
        return UserStatus;
    }

    @Override
    public UserStatus updateUserStatus(UserStatus UserStatus) {

        iUserStatusRepository.update(UserStatus);
        return UserStatus;
    }

    @Override
    public void deleteUserStatus(String UserId) {

        iUserStatusRepository.delete(UserId);
        ;
    }

    @Override
    public UserStatus getUserStatusById(String id) {

        // TODO Auto-generated method stub
        return iUserStatusRepository.findOne(id);
    }

    @Override
    public List<UserStatus> getAllUserStatus() {

        // TODO Auto-generated method stub
        return iUserStatusRepository.findAll();
    }

    @Override
    public List<UserStatus> getAllUserStatus(int Offset, int limit) {

        // TODO Auto-generated method stub
        return iUserStatusRepository.findAll(Offset, limit);
    }

}
