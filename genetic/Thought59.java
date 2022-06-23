package genetic;
import java.util.ArrayList;
class Thought59 extends Thought{
private static ArrayList<Thought59> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 475.86984845188204;
private double fd1 = 68.50708370746223;
private Thought fo0 = null;
private Thought fo1 = null;
Thought59 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought59 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought59 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought59 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought59 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought59 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought59 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought59 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought59 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[1][6] += fd0;
    fb0 = fd1 > fd0;
    Output.points[1][7] -= fd1;
    boolean lb0 = true;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = lb1 || fb0;
    boolean lb2 = false;
    Thought lo3 = Thought25.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
    boolean lb4 = false;
    lb2 = lb4 || fb0;
    fd0 = fd1 + fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    ab2 = ab3 && ab4;
        fd0 = fd1 - fd0;
    boolean lb0 = false;
    ab4 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    double ld1 = 401.9219525992713;
    fb0 = ld1 > fd0;
    fb1 = lb0 || ab1;
if(fo0 != null){
      fd1 = fo0.m3(ab2, ab3, ab4, fb0);
}
    ld1 = fd0 - fd1;
    fb1 = lb0 || ab1;
    boolean lb2 = false;
    ld1 *= -1;
    ab1 = ab2 || ab3;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    ab4 = fd1 > ld1;
    fd0 = fd1 - ld1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 39.885556138052486;
    if (fb1) {
        fd0 = fd1 + ld0;
        fb0 = fb1 && fb0;
        } else if (fb1) {
        Thought lo1 = Thought60.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        Thought lo2 = Thought86.getInstance(fd0, fd1, ld0, ad1);
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = !ab1;
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    lb0 = fd0 < fd1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought95.getInstance(fo0, fo1, fo0, fo1);
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 > ad4;
    boolean lb2 = true;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    boolean lb3 = false;
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 *= -1;
    if (fb0) {
        fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
        double ld0 = 243.175083504642;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    ad2 *= -1;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
    double ld0 = 729.6462234435357;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    boolean lb2 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ad2 = ad3 + ad4;
    lb1 = lb2 || fb0;
    Thought lo3 = Thought47.getInstance(fd0, fd1, ld0, ad1, fb1, lb1, lb2, fb0);
if(fo1 != null){
      ad2 = fo1.m3();
}
    boolean lb4 = true;
    Thought lo5 = Thought61.getInstance(ad3, ad4, fd0, fd1);
    fb0 = ld0 < ad1;
    Thought lo6 = Thought73.getInstance(fb1, lb1, lb2, lb4);
    Thought lo7 = Thought70.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, ad1, ad2, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb4, fb0, fb1, lb1);
}
    lb2 = ad3 > ad4;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    fd1 = fd0 + fd1;
    ab4 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld0 = 554.052219318433;
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ld0 = fd0 + fd1;
    double ld1 = 880.4604515883768;
    double ld2 = 10.946493487314438;
    ab4 = ld0 < ld1;
    fb0 = ld2 > fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld0, ld1, ld2);
}
    boolean lb3 = true;
if(fo1 != null){
      fo1.m2(lb3, ab1, ab2, ab3);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ld1);
}
    ab4 = fb0 && fb1;
    boolean lb4 = true;
    boolean lb5 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld0, lb3, lb4, lb5, ab1);
}
    ab2 = ld1 < ld2;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    lb3 = fd0 < fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    boolean lb6 = false;
    boolean lb7 = true;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m1();
}
    fb1 = ab1 || ab2;
if(fo0 != null){
          fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought31.getInstance(ab3, ab4, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
        double ld1 = 387.4192982390128;
    double ld2 = 275.5415601726733;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 954.9127678449238;
    fb1 = fb0 || fb1;
    boolean lb1 = true;
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
    lb1 = ld0 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    Output.points[1][8] -= ld0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
}
    double ld2 = 790.6144621398073;
    double ld3 = 410.24692357280253;
    lb1 = !fb0;
    fb1 = ld3 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = !fb0;
    Thought lo4 = Thought42.getInstance(fd1, ld0, ld2, ld3);
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;

Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    double ld1 = 221.6948896035324;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    double ld2 = 230.0197034313998;
    double ld3 = 729.3050578301117;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fb1 = ld1 > ld2;
    double ld4 = 758.45108162518;
    lb0 = ld3 > ld4;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        boolean lb5 = true;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld1, ld2, lb5, lb0, ab1, ab2);
}
        ab3 = ld3 > ld4;
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ab4 = fb0 || fb1;
        fd1 = ld1 - ld2;
        ld3 = ld4 - fd0;
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ld1, ld2, ld3, ld4);
}
if(fo1 != null){
          lb5 = fo1.m2(lb0, ab1, ab2, ab3);
}
        Thought lo6 = Thought24.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, ld4, fd0, fd1, ab4, fb0, fb1, lb5);
}
}
Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld0 = 558.0550543866144;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    lb1 = !fb0;
    ad3 *= -1;
    boolean lb2 = false;
    fb0 = ad4 < fd0;
    Output.points[2][0] += fd1;
    boolean lb3 = false;
    boolean lb4 = true;
    Output.points[2][1] += ld0;
    lb4 = ad1 > ad2;
    Output.points[2][2] -= ad3;
    double ld5 = 919.7726635578134;
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb3 = !lb4;
    boolean lb6 = false;
    ld0 = ld5 - ad1;

Thought.STACK_COUNTER++;
return lb6;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 > ad3;
    ab3 = !ab4;
    fb0 = fb1 || ab1;
    ab2 = !ab3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    ab4 = ad3 < ad4;
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
        boolean lb0 = false;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;

Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
    lb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, lb1, fb0);
}
    fb1 = fd0 > fd1;
    lb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(ao2 != null){
      ao2.m1();
}
    Thought lo2 = Thought23.getInstance(fd0, fd1, fd0, fd1);
if(ao3 != null){
              ao3.m1(lb1, fb0, fb1, lb0);
}
    Thought lo3 = Thought42.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    lb1 = fb0 || fb1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    Thought lo0 = Thought99.getInstance(fo1, ao1, ao2, ao3);
    fb1 = fb0 && fb1;
    fb0 = ad1 < ad2;
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    ad2 *= -1;
    boolean lb1 = true;
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    double ld2 = 18.158080688207075;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[2][3] -= ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    Thought lo3 = Thought11.getInstance(fb0, fb1, lb1, fb0);
    ld2 *= -1;
    double ld4 = 566.4286374525942;
    fb1 = ld4 > ad1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    lb1 = fb0 || fb1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld2, ld4, ad1, ad2, lb1, fb0, fb1, lb1);
}
    fb0 = ad3 < ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb1, fb0, fb1);
}
    Thought lo5 = Thought90.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fo0.m2(fd0, fd1, ld2, ld4, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m1();
}
    for(int i0=0; i0<10; i0++){
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(fd0, fd1, fd0, fd1);
}
    double ld0 = 927.2540749051311;
    ab2 = ld0 > fd0;
    ab3 = ab4 && fb0;
    fb1 = fd1 < ld0;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - ld0;
        Thought lo1 = Thought10.getInstance(ab1, ab2, ab3, ab4);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
}
Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought4.getInstance(ao2, ao3, ao4, fo0);
    double ld1 = 444.6431416034962;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ld1;
    ab4 = ad1 > ad2;
    boolean lb2 = true;
if(ao1 != null){
      ao1.m2();
}
    Output.points[2][4] -= ad3;
    ad4 *= -1;
    fd0 = fd1 - ld1;

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    fd1 *= -1;
    double ld0 = 16.98253508977133;
    ld0 *= -1;
    fd0 *= -1;
    fb0 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    fd0 = fd1 - ld0;
    fb0 = fd0 > fd1;
    ld0 = fd0 - fd1;
    double ld2 = 703.5193481670178;
    fb1 = ld0 > ld2;
    lb1 = fb0 && fb1;
    fd0 = fd1 - ld0;

Thought.STACK_COUNTER++;
return ld2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        Thought lo1 = Thought98.getInstance();
        Thought lo2 = Thought22.getInstance(fd1, fd0, fd1, fd0);
        fb1 = lb0 || ab1;
if(fo0 != null){
          fo0.m3(ab2, ab3, ab4, fb0);
}
        boolean lb3 = true;
        for(int i1=0; i1<10; i1++){
            fb0 = fb1 || lb3;
            lb0 = fd1 > fd0;
if(fo1 != null){
              fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
            Thought lo4 = Thought24.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
            Output.points[2][5] += fd0;
            fb0 = fd1 < fd0;
if(fo0 != null){
              fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb3, lb0, ab1);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            double ld5 = 430.2026229565507;
            ab2 = !ab3;
            Output.points[2][6] += ld5;
            boolean lb6 = false;
            fd0 = fd1 - ld5;
if(fo1 != null){
              fo1.m3(fd0, fd1, ld5, fd0, ab3, ab4, fb0, fb1);
}
            fd1 *= -1;
}}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3();
}
    ad3 = ad4 + fd0;
        fb0 = !fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ad1, ad2, ad3);
}
    fb0 = !fb1;
    Thought lo0 = Thought9.getInstance(fb0, fb1, fb0, fb1);
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
    ad1 *= -1;
    fb1 = lb1 || fb0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ad2 = fo0.m3();
}
        fb1 = ad3 < ad4;
        double ld2 = 609.1744746280738;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ld2);
}
if(fo0 != null){
          fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
        double ld3 = 116.21181246656049;
        Output.points[2][7] += ld3;
}
Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 89.75584236448083;
    ab2 = ab3 || ab4;
    Thought lo1 = Thought3.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fb0 = !fb1;
    fd0 = fd1 - ld0;
    double ld2 = 354.5356733063378;
    ab1 = ab2 || ab3;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld2, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ad3 = fo0.m3();
}
    boolean lb3 = false;
    ab4 = fb0 || fb1;
        lb3 = !ab1;
    ad4 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ld0, ld2);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(ab3, ab4, fb0, fb1);
}
    lb3 = ab1 || ab2;
    ab3 = fd0 > fd1;

Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][8] += fd1;
    Thought lo0 = Thought38.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought74.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    boolean lb2 = false;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb2);
}
        double ld3 = 569.0045484680466;
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    fb1 = ld3 < fd0;
    lb2 = fb0 && fb1;
    Output.points[3][0] -= fd1;
    boolean lb4 = false;
if(ao2 != null){
      lb2 = ao2.m2(ld3, fd0, fd1, ld3, lb4, fb0, fb1, lb2);
}
    fd0 = fd1 - ld3;
    lb4 = fd0 < fd1;
    ld3 *= -1;
if(ao3 != null){
      ao3.m2();
}
    Thought lo5 = Thought75.getInstance(fd0, fd1, ld3, fd0);
    boolean lb6 = false;
    Thought lo7 = Thought32.getInstance(lb6, fb0, fb1, lb2);
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld3, fd0, fd1, ld3);
}
    fd0 = fd1 + ld3;
    fd0 *= -1;
        boolean lb8 = false;
    lb4 = !lb6;
    fd1 = ld3 + fd0;
    lb8 = !fb0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought52.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
    fd1 *= -1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    if (fb1) {
if(ao4 != null){
          ao3 = ao4.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        fb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb1 = ad1 > ad2;
        double ld1 = 593.1574554004508;
        Thought lo2 = Thought37.getInstance(ad2, ad3, ad4, fd0);
        Thought lo3 = Thought9.getInstance(fb0, fb1, fb0, fb1);
        } else {
        fb0 = ad1 > ad2;
}
Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Output.points[3][1] += fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought88.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    double ld2 = 57.690627741002196;
    fd0 *= -1;
    fd1 = ld2 + fd0;
    fd1 = ld2 - fd0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, ab1);
}
    boolean lb3 = false;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Thought lo0 = Thought46.getInstance(ao1, ao2, ao3, ao4);
    Output.points[3][2] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    Thought lo1 = Thought43.getInstance();
if(ao1 != null){
      ao1.m1(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    ab2 = ad1 < ad2;
    ab3 = ab4 || fb0;
if(ao2 != null){
      ad3 = ao2.m3(fb1, ab1, ab2, ab3);
}
    Output.points[3][3] -= ad4;
    ab4 = fb0 || fb1;
    double ld2 = 237.99056881549132;
    double ld3 = 962.3626663779913;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    Output.points[3][4] += ld2;
    ab1 = ld3 > ad1;
    Thought lo4 = Thought8.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    fd1 = ld2 - ld3;

Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld0 = 171.11729023150681;
    fb0 = ld0 > fd0;
    Thought lo1 = Thought98.getInstance(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
        Output.points[3][5] += ld0;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
    boolean lb3 = false;
    boolean lb4 = true;
    lb3 = ld0 > fd0;
    fd1 = ld0 + fd0;
    boolean lb5 = false;
if(fo1 != null){
      fo1.m1(lb4, lb5, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    boolean lb6 = false;
    boolean lb7 = true;
    lb2 = ld0 < fd0;
        fd1 = ld0 - fd0;
    double ld8 = 349.7496930515002;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld8, lb3, lb4, lb5, lb6);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb7, fb0, fb1, lb2);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = fd0 < fd1;
if(fo1 != null){
      ab3 = fo1.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    double ld0 = 693.1628326826259;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ab3 || ab4;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
    fb0 = !fb1;
    Thought lo1 = Thought36.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    double ld2 = 895.7010575757095;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 > ad3;
    Thought lo0 = Thought6.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[3][6] -= ad4;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    if (fb0) {
        Thought lo1 = Thought80.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
        Output.points[3][7] -= fd0;
        double ld2 = 204.51107893584089;
        if (fb1) {
            fd0 = fd1 + ld2;
if(fo0 != null){
              ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
            fd1 = ld2 + ad1;
            fb0 = !fb1;
if(fo1 != null){
              fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
}}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3);
}
    Output.points[3][8] -= ad4;
    double ld0 = 637.9563739317155;
    double ld1 = 763.0457345661254;
if(fo1 != null){
          fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    ad3 = ad4 + fd0;
    fd1 *= -1;
    Thought lo2 = Thought61.getInstance(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought65.getInstance(fo0, fo1, fo0, fo1);
    ab1 = ab2 && ab3;
    boolean lb4 = true;
if(fo0 != null){
      ab3 = fo0.m2(ld0, ld1, ad1, ad2, ab4, fb0, fb1, lb4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb5 = true;
    ad3 = ad4 + fd0;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
    lb0 = fd1 > fd0;
    lb1 = fd1 < fd0;
if(ao3 != null){
      ao3.m1(fb0, fb1, lb0, lb1);
}
    boolean lb2 = false;
    Thought lo3 = Thought19.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
    boolean lb4 = false;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb2, lb4, fb0, fb1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, lb1, lb2, lb4);
}
        if (fb0) {
            fb1 = lb0 && lb1;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
            lb2 = lb4 && fb0;
if(ao2 != null){
              fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
}
            Output.points[4][0] -= fd0;
            lb4 = fb0 && fb1;
}}
Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2();
}
    Output.points[4][1] -= ad2;
    fb1 = !fb0;
if(ao3 != null){
      fb1 = ao3.m2(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = true;
    double ld2 = 235.73298505161114;
    lb0 = !lb1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fb1 = ab1 || ab2;
    ab3 = fd0 > fd1;
    Thought lo0 = Thought14.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fd0 *= -1;
    double ld1 = 640.7517686016026;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fd1 > ld1;
if(fo0 != null){
          fb1 = fo0.m2();
}
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ld1, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
        double ld2 = 888.730594503676;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld2, ld1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld2, ld1, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
}
Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    Thought lo0 = Thought0.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
    Thought lo1 = Thought85.getInstance();
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
    fb1 = !ab1;
    boolean lb2 = false;
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    for(int i0=0; i0<10; i0++){
        ad2 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(lb3, ab1, ab2, ab3);
}
        ad3 *= -1;
        ab4 = !fb0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb1, lb2, lb3, ab1);
}
        double ld4 = 657.377765806134;
if(fo0 != null){
          ld4 = fo0.m3(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
        Thought lo5 = Thought22.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
          ad1 = ao2.m3(ad2, ad3, ad4, fd0, fb1, lb2, lb3, ab1);
}
        Output.points[4][2] += fd1;
        ab2 = ab3 || ab4;
        Thought lo6 = Thought5.getInstance();
        Thought lo7 = Thought77.getInstance(ld4, ad1, ad2, ad3);
        ad4 = fd0 + fd1;
        boolean lb8 = true;
if(ao4 != null){
          ao3 = ao4.m4(ab4, fb0, fb1, lb8);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld4, ad1, ad2, ad3);
}
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought39.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    Thought lo2 = Thought25.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      lb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = !fb0;
    fb1 = lb0 || fb0;
    fb1 = fd1 > fd0;
    Output.points[4][3] += fd1;
    boolean lb1 = false;
    boolean lb2 = false;
    boolean lb3 = false;
    Output.points[4][4] += fd0;
    fd1 = fd0 - fd1;
        lb0 = fd0 > fd1;
    Output.points[4][5] += fd0;
    lb1 = fd1 > fd0;
    Thought lo4 = Thought36.getInstance(fo0, fo1, fo0, fo1);
    double ld5 = 65.81304346569787;
    double ld6 = 489.46919681361953;
    boolean lb7 = true;
    ld6 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld5, ld6, fd0, lb2, lb3, lb7, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
    Output.points[4][6] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[4][7] += fd0;
    double ld0 = 427.9892960025738;
    double ld1 = 219.9273978910144;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld1 = fd0 - fd1;
    fb0 = !fb1;
    fb0 = ld0 < ld1;
    fd0 *= -1;
    fb1 = fb0 || fb1;
    Thought lo2 = Thought16.getInstance(fd1, ld0, ld1, fd0, fb0, fb1, fb0, fb1);
    fd1 *= -1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m2();
}
    boolean lb3 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
