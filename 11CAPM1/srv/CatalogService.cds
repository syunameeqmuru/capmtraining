using { anubhav.db.master, anubhav.db.transaction } from '../db/datamodel';


service CatalogService@(path:'/CatalogService') {

    entity EmployeeSet as projection on master.employees;
    entity AddressSet as projection on master.address;
    entity ProductSet as projection on master.product;
    entity ProductTexts as projection on master.prodtext;
    entity BPSet as projection on master.businesspartner;

}