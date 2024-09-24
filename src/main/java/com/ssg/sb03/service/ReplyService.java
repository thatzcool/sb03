package com.ssg.sb03.service;

import com.ssg.sb03.dto.PageRequestDTO;
import com.ssg.sb03.dto.PageResponseDTO;
import com.ssg.sb03.dto.ReplyDTO;

public interface ReplyService {

    Long register(ReplyDTO replyDTO);

    ReplyDTO read(Long rno);

    void modify(ReplyDTO replyDTO);

    void remove(Long rno);

    PageResponseDTO<ReplyDTO> getListOfBoard(Long bno, PageRequestDTO pageRequestDTO);

}
