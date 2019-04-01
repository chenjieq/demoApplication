package com.test.restspring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import org.springframework.stereotype.Service;

import org.springframework.util.Assert;



@Service
@RefreshScope

public class userServiceImpl {



        private final UserRepository userRepository;
        @Autowired
        public userServiceImpl(UserRepository userRepository) {
            this.userRepository = userRepository;
        }


        //@Override
        public User getUser(String name) {
            Assert.notNull(name, "Name must not be null");
            return this.userRepository.findByName(name);

      }

}
