package ir.fardup.product.product.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
public class ProductCreateModel extends ProductModel {
}
