var Greeeting = (function () {
    function Greeeting() {
    }
    Greeeting.prototype.greet = function () {
        console.log("hello world...Babu got good mark in halfyearly!");
    };
    return Greeeting;
}());
var greet = new Greeeting();
greet.greet();
