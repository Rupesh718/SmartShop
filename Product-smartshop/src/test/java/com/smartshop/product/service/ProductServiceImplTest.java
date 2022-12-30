package com.smartshop.product.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.mockito.junit.jupiter.MockitoExtension;


import com.smartshop.product.entity.Product;
import com.smartshop.product.repository.ProductRepo;

@ExtendWith(MockitoExtension.class)
class ProductServiceImplTest {
	
	@InjectMocks
	private ProductServiceImpl productService;
	
	@Mock
	private ProductRepo productrepo;
//	
//	@BeforeEach
//	public void setup() throws Exception {
//		MockitoAnnotations.openMocks(this);
//	}
	@Test
	void testAddProduct() {
		Product pro = new Product(50,"laptop",18000,1);
		Mockito.when(productrepo.save(pro)).thenReturn(pro);
		
		Product actual=productService.addProduct(pro);
		assertEquals(pro, actual);
	}
	

//	@Test
//	void testSaveProducts() {
//		fail("Not yet implemented");
//	}
//
	@Test
	void testGetAllProducts() {
	        Product p1 = new Product(2000,"furniture",57456,1);
	        Product p2 = new Product(2001,"sofa",5456,2);
	        Product p3 = new Product(2002,"mixer",7456,3);
	        List<Product> listOfProducts=new ArrayList();
	        listOfProducts.add(p1);listOfProducts.add(p2);listOfProducts.add(p3);
	        Mockito.when(productrepo.findAll()).thenReturn(listOfProducts);
	        List<Product> actuals=productService.GetAllProducts();
	        assertEquals(listOfProducts, actuals);
	        assertEquals(listOfProducts.size(), actuals.size());
	        assertEquals(listOfProducts.get(0), actuals.get(0));
	    }

//
	@Test
	void testGetProductbyId() {
	Product p1 = new Product(2000,"furniture",57456,1);
    Optional<Product> optionalProduct=Optional.of(p1);
    Mockito.when(productrepo.findById(2000)).thenReturn(optionalProduct);
    Optional<Product> actuals=productService.GetProductbyId(2000);
    Product actualProduct = actuals.get();
    assertEquals(p1.getpId(), actualProduct.getpId());
    assertEquals(p1.getpName(), actualProduct.getpName());
    assertEquals(p1.getpPrice(), actualProduct.getpPrice());
	}
//
//	@Test
//	void testDeletProductbyId() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testFindBypName() {
//	Product p1 = new Product(2000,"furniture",57456,1);
//   Product product=(p1);
//    Mockito.when(productrepo.findBypName(2000)).thenReturn(product);
//    Product product actuals=productService.findBypName("furniture");
//    Product actualProduct = actuals.get();
//    assertEquals(p1.getpId(), actualProduct.getpId());
//    assertEquals(p1.getpName(), actualProduct.getpName());
//    assertEquals(p1.getpPrice(), actualProduct.getpPrice());
//	}

}
