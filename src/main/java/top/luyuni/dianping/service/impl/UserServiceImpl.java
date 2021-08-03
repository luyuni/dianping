package top.luyuni.dianping.service.impl;

import org.springframework.stereotype.Service;
import top.luyuni.dianping.dal.UserModelMapper;
import top.luyuni.dianping.model.UserModel;
import top.luyuni.dianping.service.UserService;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserModelMapper userModelMapper;

    @Override
    public UserModel getUser(Integer id) {
        return userModelMapper.selectByPrimaryKey(id);
    }
}
