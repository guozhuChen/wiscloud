package com.wiscloud.controller;


import com.wiscloud.dto.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Leslie on 2017/4/9.
 */
public class AbstractBaseController {

    protected static Logger logger = LoggerFactory.getLogger(AbstractBaseController.class.getName());


    protected ResponseDto successResponse(String message, Object data) {
        ResponseDto response = new ResponseDto();
        response.setStatus(1); // 成功
        response.setMessage(message);
        response.setData(data);
        return response;
    }
}
