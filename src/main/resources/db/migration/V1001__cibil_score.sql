CREATE TABLE cibil_score (
	cibil_id int4 NOT NULL,
	cibil_score float8 NULL,
	"name" varchar(255) NULL,
	pancard_no varchar(255) NULL,
	CONSTRAINT cibil_score_pkey PRIMARY KEY (cibil_id)
);

CREATE SEQUENCE seq_cibil_score
     START WITH 1
     INCREMENT BY 1
     NO MINVALUE
     NO MAXVALUE
     CACHE 1;

 ALTER SEQUENCE seq_cibil_score OWNED BY cibil_score.cibil_id;
 ALTER TABLE ONLY cibil_score ALTER COLUMN cibil_id SET DEFAULT nextVal('seq_cibil_score'::regclass);

