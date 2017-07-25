# tableperclass

The problem now shows itself:

http://localhost:8080/test/test1 

This should print all ohho we have.. but instead the first has updated correctly and the othe 2 refreshes on println shows correct information but actual page refrsh or relisting shows old ahh results

```
[ahha Tue Jul 25 18:48:10 BST 2017 - 2017-07-25 18:48:10.632, ahha Tue Jul 25 18:48:12 BST 2017 - 2017-07-25 18:48:12.629, ohho we have a new name Tue Jul 25 18:48:16 BST 2017 - Tue Jul 25 18:48:16 BST 2017]
```

If you rever this changeset https://github.com/vahidhedayati/tableperclass/commit/30a78ab08b0dfaa3721d0d4e30dd31588aa08279
back to original grails gorm version and hibernate you will see 

http://localhost:8080/test/test1

produces:
```
[ohho we have a new name Tue Jul 25 18:52:51 BST 2017 - 2017-07-25 18:52:51.2, ohho we have a new name Tue Jul 25 18:52:52 BST 2017 - 2017-07-25 18:52:52.024, ohho we have a new name Tue Jul 25 18:52:52 BST 2017 - 2017-07-25 18:52:52.774, ohho we have a new name Tue Jul 25 18:52:53 BST 2017 - Tue Jul 25 18:52:53 BST 2017]
```
