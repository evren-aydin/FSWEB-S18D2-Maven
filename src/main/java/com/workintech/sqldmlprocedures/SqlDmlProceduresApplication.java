package com.workintech.sqldmlprocedures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqlDmlProceduresApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqlDmlProceduresApplication.class, args);
	}
//	select * from ogrenci
//	select * from kitap
//	select * from islem
//	select * from tur
//	select * from yazar
//--1) Biyografi türünü tür tablosuna ekleyiniz.
//	insert into tur(ad) values('Biyografi');
//
//--2) Nurettin Belek isimli yazarı yazar tablosuna ekleyiniz.
//	insert into yazar (ad,soyad) values('Nurettin','Belek');
//
//--3) 10B sınıfındaki öğrencileri 10C sınıfına geçirin.
//	update ogrenci set sinif='10C' where sinif='10B';
//
//--4) Tüm kitapların puanını 5 puan arttırınız.
//	update kitap set puan=puan+5;
//
//--5) Adı Mehmet olan tüm yazarları silin.
//	delete from yazar where ad='Mehmet';
//
//--6) Kişisel Gelişim isimli bir tür oluşturun.
//	insert into tur(ad) values('Kişisel Gelişim');
//
//--7) 'Benim Üniversitelerim' isimli kitabın türünü 'Kişisel Gelişim' yapın.
//	update kitap set turno = (
//			select turno from tur where ad='Kişisel Gelişim'
//			) where ad='Benim Üniversitelerim';
//
//--8) Öğrenci tablosunu kontrol etmek amaçlı tüm öğrencileri görüntüleyen
//--"ogrencilistesi" adında bir fonksiyon oluşturun.
//	create function
//	ogrencilistesi()
//	returns setof ogrenci
//	language 'sql'
//	as $BODY$
//	select * from ogrenci
//	$BODY$;
//
//	select * from ogrencilistesi();
//
//
//--9) kitap tablosuna yeni kitap eklemek için
//--"ekle" adında bir prosedür oluşturun.
//	create procedure
//	ekle(kitap_ad character varying,kitap_puan integer,
//		 kitap_yazarno bigint,kitap_turno bigint)
//	language 'sql'
//	as $BODY$
//	insert into kitap(ad,puan,yazarno,turno)values
//	(kitap_ad,kitap_puan,kitap_yazarno,kitap_turno)
//	$BODY$;
//
//	call ekle('Sefiller',12,5,3);
//
//
//--10) Öğrenci noya göre öğrenci silebilmeyi
//--sağlayan "sil" adında bir prosedür oluşturun.
//
//	create procedure
//	sil(ogrenci_no bigint)
//	language 'sql'
//	as $BODY$
//	delete from ogrenci where ogrno=ogrenci_no
//			$BODY$;
//
//	call sil(5);

}
