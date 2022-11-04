package com.project.shop.home;

import com.project.shop.board.BoardDTO;
import com.project.shop.check.CheckDTO;
import com.project.shop.list.ListDTO;
import com.project.shop.order.OrderDTO;
import com.project.shop.prlist.PrlistDTO;
import com.project.shop.profit.ProfitDTO;
import com.project.shop.seller.SellerDTO;
import com.project.shop.user.UserDTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TotalDTO {
    BoardDTO dto;
    CheckDTO cto;
    ListDTO lto;
    OrderDTO oto;
    ProfitDTO pto;
    SellerDTO sto;
    UserDTO uto;
    PrlistDTO prto;

}
