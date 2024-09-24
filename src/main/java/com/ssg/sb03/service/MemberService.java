package com.ssg.sb03.service;

import com.ssg.sb03.dto.MemberJoinDTO;

public interface MemberService {
    static class MidExistException extends Exception {

    }

    void join(MemberJoinDTO memberJoinDTO)throws MidExistException ;

}