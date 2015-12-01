require.config({
    shim: {
        //"jquery" : {
        //    "exports" : "$"
        //}
    },
    paths: {
        'thirdParty' : ['test/testlib'],
        'jquery': ['../lib/jquery/jquery']
    }
});

require(["thirdParty", 'jquery'], function(l) {
    var s = l.sum(4, 5);
    alert(s);

    console.log($);

    $("body").addClass("my_body");
});

require(['jquery'], function($) {
    console.log($);
});