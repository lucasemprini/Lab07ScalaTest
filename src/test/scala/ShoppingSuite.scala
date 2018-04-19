import org.scalatest.FunSuite
import u07lab._

import scala.collection.immutable.HashMap


class CartSuite extends FunSuite {
  test("Cart should add items") {
    val cart: Cart = new BasicCart(Map.empty)
    val foc: Item = Item(Product("Focaccine Esselunga"), ItemDetails(1, Price(2000)))
    cart.add(foc)
    assert(cart.size > 0)
    assert(cart.size == 1)
    assert(cart.totalCost == 2000)
  }
}

class CatalogSuite extends FunSuite {
  test("Cart should add items") {
    val foc: Product = Product("Focaccine Esselunga")
    val cat: Catalog = new BasicCatalog(new HashMap[Product, Price]())
  }
}

class WarehouseSuite extends FunSuite {

}