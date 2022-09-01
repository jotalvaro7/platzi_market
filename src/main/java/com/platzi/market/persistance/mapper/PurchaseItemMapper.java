package com.platzi.market.persistance.mapper;

import com.platzi.market.domain.dto.PurchaseItem;
import com.platzi.market.persistance.entity.ComprasProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {

    @Mapping(source = "id.idProducto", target = "productId")
    @Mapping(source = "cantidad", target = "quantity")
    @Mapping(source = "total", target = "total")
    @Mapping(source = "estado", target = "active")
    PurchaseItem toPurchaseItem(ComprasProducto comprasProducto);


    @InheritInverseConfiguration
    @Mapping(target = "id.idCompra", ignore = true)
    @Mapping(target = "compra", ignore = true)
    @Mapping(target = "producto", ignore = true)
    ComprasProducto toComprasProducto(PurchaseItem purchaseItem);

}
