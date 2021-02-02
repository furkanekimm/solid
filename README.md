# SOLID 

-Single Responsibility Principle
-Open / Closed Principle (OCP)
-Liskov Substitution Principle
-Interface Segregation Principle
-Dependency Inversion Principle

## Single Responsibility Principle

"Her sınıfın veya metodun tek bir sorumluluğu olmalı"

Yazılan class veya metotlar tek bir görevi yapacak şekilde modüllere ayrılmalıdır.

Eğer bu durum gözardı edilirse karşımıza çıkan kod içinde herbir class farklı farklı işleri yapması ve metotların da kendi görevlerinin dışında başka işleri
de yapmasından kaynaklanan "Makarna Kod" yani karmaşık kod blokları ortaya çıkar. Bu durum hiçbir yazılımcının hoşuna gitmez ve kodu okuyan kişi içi çıkılmaz bir duruma dönüşür.

## Open / Closed Principle (OCP)

"Sınıflar değişikliğe kapalı ancak gelişime açık olmalı"

Projemizi geliştirirken ileri görüşlü olmamız gerekir. Sonradan oluşabilecek gelişmeleri ve yeni istekleri öngörerek tasarlamamız gerekir. Bu durum tüm kodların değişmesi
yerine sadece ilgili yer değiştirilerek işlemimizi yapmamızı sağlar.

## Liskov Substitution Principle

Türeyen sınıf yani alt sınıflar ana(üst) sınıfın tüm özelliklerini ve metotlarını aynı işlevi gösterecek şekilde kullanabilme ve kendine ait yeni özellikler barındırabilmelidir.

“Alt seviye sınıflardan oluşan nesnelerin/sınıfların, ana(üst) sınıfın nesneleri ile yer değiştirdikleri zaman, aynı davranışı sergilemesi gerekmektedir. Türetilen sınıflar, türeyen sınıfların tüm özelliklerini kullanabilmelidir.”

## Interface Segregation Principle

“Ara yüzlerin ayrılması prensibi”

Temel amacı ara yüz implementation sonucunda oluşacak gereksiz kodları önlemek ve kodumuzun daha amaca yönelik hale gelmesini sağlamaktır.
Biraz daha açıklamak gerekirse, ara yüzler içinde sadece metotların imzaları bulunur. Bir ara yüz bir sınıfa implemente edildiği zaman, ara yüz’ün barındırdığı metotları barındırmak veya oluşturmak zorundadır. Zaten bu durumun aksi olduğundan hata alırız.

## Dependency Inversion Principle

“Katmanlı mimarilerde üst seviye modüller alt seviyedeki modüllere doğruda bağımlı olmamalıdır.”

Burada amaç üst seviyedeki modüllerin alt seviyelere bağımlı olmasından dolayı çıkabilecek sorunları ortadan kaldırmaktır. Yani alt seviyede yapılan herhangi bir değişikliğin üst seviyede kod değişikliğine veya onun bağlılıklarının etkilenmesine engel olmaktır amaç.


# Kaynaklar

- https://howtodoinjava.com/design-patterns/single-responsibility-principle/

- http://joelabrahamsson.com/a-simple-example-of-the-openclosed-principle/

- https://howtodoinjava.com/design-patterns/single-responsibility-principle/

- https://www.baeldung.com/java-single-responsibility-principle#:~:text=For%20example%2C%20if%20we%20have,the%20text%20in%20some%20way

- https://medium.com/pirilab/soli%CC%87d-prensipleri-1-1412bb3f1c70

- https://medium.com/pirilab/soli%CC%87d-prensipleri-2-ec74fdf46964