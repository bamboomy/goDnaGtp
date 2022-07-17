package genetic;
import java.util.ArrayList;
class Thought28 extends Thought{
private static ArrayList<Thought28> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 44.096801008146585;
private double fd1 = 283.3182613464158;
private Thought fo0 = null;
private Thought fo1 = null;
Thought28 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought28 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought28 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought28 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought28 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought28 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought28 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought28 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought28 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
    Output.points[7][8] -= fd1;
    Thought lo0 = Thought8.getInstance(fo0, fo1, fo0, fo1);
    fb1 = !fb0;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    Thought lo2 = Thought31.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    lb1 = !fb0;
    fb1 = lb1 && fb0;
    Thought lo3 = Thought356.getInstance(fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
    Thought lo4 = Thought179.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(lb0, ab1, ab2, ab3);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb1 = true;
        fd0 = fd1 - fd0;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 > ad3;
    double ld0 = 771.7459651182891;
    ad3 = ad4 + fd0;
    fb1 = fd1 > ld0;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
        Output.points[8][0] -= ad1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
    Output.points[8][1] += fd1;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    Thought lo2 = Thought361.getInstance();
    lb1 = ad4 < fd0;

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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, ab1, ab2, ab3);
}
    double ld0 = 406.35884968967827;
    fd0 = fd1 - ld0;
    ab4 = !fb0;
    Output.points[8][2] += ad1;
    fb1 = !ab1;
    Thought lo1 = Thought106.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
        double ld2 = 581.5229420263277;
    boolean lb3 = true;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought276.getInstance(fb1, fb0, fb1, fb0);
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    if (fb1) {
        fd0 = fd1 + fd0;
        fb0 = fd1 < fd0;
        double ld1 = 37.92802811995713;
        Output.points[8][3] += fd0;
        boolean lb2 = false;
        fb0 = fd1 > ld1;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ld1, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1);
}
        fb1 = ld1 < fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld1, fd0, fd1, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb2, fb0);
}
        ld1 = fd0 + fd1;
        ld1 = fd0 - fd1;
        ld1 = fd0 + fd1;
        ld1 *= -1;
        fb1 = lb2 || fb0;
if(ao4 != null){
          fb1 = ao4.m2();
}
if(fo0 != null){
          lb2 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0, fb0, fb1, lb2, fb0);
}
if(ao4 != null){
          ao4.m1(fb1, lb2, fb0, fb1);
}
        lb2 = !fb0;
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
    Thought lo0 = Thought346.getInstance(ao1, ao2, ao3, ao4);
    ad1 = ad2 + ad3;
    double ld1 = 982.0958494052691;
    fb0 = ad3 > ad4;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ad1);
}
    Output.points[8][4] -= ad2;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    double ld2 = 403.99253451493644;
    fb1 = fb0 || fb1;
    ad3 = ad4 - fd0;
    fd1 = ld1 - ld2;
    boolean lb3 = true;
    boolean lb4 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb3, lb4, fb0, fb1);
}
if(ao2 != null){
      ad1 = ao2.m3();
}
    lb3 = ad2 < ad3;
    ad4 *= -1;
    fd0 = fd1 + ld1;
    boolean lb5 = false;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ld2, ad1, ad2, ad3, lb4, lb5, fb0, fb1);
}
    Thought lo6 = Thought46.getInstance(lb3, lb4, lb5, fb0);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][5] += fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    ab1 = fd1 > fd0;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        ab1 = !ab2;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        double ld1 = 933.954541139864;
        Thought lo2 = Thought315.getInstance(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
        ab4 = ld1 > fd0;
if(ao1 != null){
          fd1 = ao1.m3();
}
        fb0 = !fb1;
        ld1 = fd0 + fd1;
if(ao2 != null){
          lb0 = ao2.m2(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
        fb0 = fd0 < fd1;
        fb1 = lb0 || ab1;
        double ld3 = 189.70161865568411;
        ld1 *= -1;
if(ao1 != null){
          ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
        lb0 = !ab1;
        double ld4 = 299.8338932905535;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
    boolean lb0 = false;
    ab1 = ad3 < ad4;
    if (ab2) {
        } else {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
if(ao4 != null){
          ao4.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
        double ld1 = 0.5769756948666439;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
          fo0.m2();
}
        ab4 = ld1 < ad1;
        double ld2 = 94.82061311685624;
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
        Thought lo3 = Thought91.getInstance(ab3, ab4, fb0, fb1);
        lb0 = fd0 < fd1;
if(fo0 != null){
          ab1 = fo0.m2(fo1, ao1, ao2, ao3);
}
        Thought lo4 = Thought355.getInstance(ld1, ld2, ad1, ad2);
        ad3 = ad4 - fd0;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought316.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb0 = !fb1;
    fd1 *= -1;
    fb0 = fd0 > fd1;
    fb1 = !fb0;

Thought.STACK_COUNTER++;
return fb1;
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
    ab1 = fd0 < fd1;
    Thought lo0 = Thought34.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = fd0 > fd1;
    ab1 = fd0 > fd1;
    if (ab2) {
        fd0 *= -1;
        Thought lo1 = Thought298.getInstance(ab3, ab4, fb0, fb1);
        double ld2 = 946.4263290048243;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m3(fd0, fd1, ld2, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
        ab1 = !ab2;
if(fo1 != null){
          fo0 = fo1.m4(ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1();
}
    fb1 = ad2 < ad3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    ad2 *= -1;
    double ld1 = 850.5260824144385;
    lb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
    fb0 = ld1 > ad1;
    fb1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld1);
}
    double ld2 = 367.8493358396649;
    boolean lb3 = false;
    fb0 = fb1 || lb0;
    boolean lb4 = true;

Thought.STACK_COUNTER++;
return lb3;
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
    Output.points[8][6] += ad2;
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 + fd0;
        if (ab1) {
            fd1 = ad1 + ad2;
            double ld0 = 270.6492682646758;
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
            if (ab2) {
                ab3 = fd1 > ld0;
                ab4 = !fb0;
if(fo1 != null){
                  fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
                boolean lb1 = true;
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
                } else {
if(fo0 != null){
                  fd0 = fo0.m3();
}
                ab1 = fd1 > ld0;
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
}}}
Thought.STACK_COUNTER++;
return fb1;
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
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    boolean lb1 = true;
    double ld2 = 916.9394201129002;
    lb0 = !lb1;
    ld2 *= -1;
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, lb1, fb0);
}
    ld2 = fd0 + fd1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    fb1 = ld2 < fd0;
    for(int i0=0; i0<10; i0++){
        lb0 = fd1 < ld2;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld2, fd0);
}
        Thought lo3 = Thought270.getInstance(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1);
        Output.points[8][7] += ld2;
        double ld4 = 222.07632791948063;
        lb1 = ld2 > fd0;
        fd1 *= -1;
        double ld5 = 142.40045712942745;
if(ao4 != null){
          ao3 = ao4.m4(ld4, ld5, ld2, fd0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld0 = 250.0360557406447;
    fb1 = fb0 || fb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo1 = Thought21.getInstance(fb1, fb0, fb1, fb0);
    Thought lo2 = Thought109.getInstance(ao3, ao4, fo0, fo1);
    fb1 = fb0 || fb1;
    boolean lb3 = false;
    Output.points[8][8] += fd0;
    lb3 = fd1 > ld0;
    Thought lo4 = Thought214.getInstance(ad1, ad2, ad3, ad4);
    Output.points[0][0] -= fd0;
    fb0 = fb1 || lb3;
    double ld5 = 247.0881197973148;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld5, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0, fb0, fb1, lb3, fb0);
}
    ld5 *= -1;
    double ld6 = 105.02971375701107;
    boolean lb7 = false;
    fb0 = ld6 < ad1;

Thought.STACK_COUNTER++;
return fb1;
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
    ab1 = fd0 < fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    double ld1 = 431.759117864918;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb0 = !fb1;
    ld1 *= -1;
    Thought lo2 = Thought211.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0, lb0, ab1, ab2, ab3);
    ab4 = fd1 < ld1;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;
    double ld3 = 176.54193562509698;
    ld3 = fd0 + fd1;
    boolean lb4 = true;

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
    ab2 = !ab3;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    ab3 = !ab4;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
        fb1 = ad3 < ad4;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
        ad3 = ad4 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
}
        ab1 = ab2 && ab3;
        boolean lb1 = false;
        ab3 = !ab4;
        fd1 = ad1 + ad2;
        boolean lb2 = false;
        ab4 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb1 = lb1 || lb2;
        for(int i1=0; i1<10; i1++){
}}
Thought.STACK_COUNTER++;
return ab2;
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    Thought lo0 = Thought344.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo1.m1();
}
    fb1 = fd1 > fd0;
        Output.points[0][1] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        Output.points[0][2] += fd1;
        boolean lb0 = false;
        ab4 = !fb0;
        Thought lo1 = Thought20.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo2 = Thought268.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
        lb0 = fd0 < fd1;
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
        fb0 = fd1 > fd0;
        fd1 *= -1;
        double ld3 = 587.56478633664;
        fb1 = lb0 && ab1;
        boolean lb4 = false;
        ab1 = ld3 > fd0;
        boolean lb5 = true;
        double ld6 = 136.87869430781885;
        ab1 = ab2 && ab3;
}
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
    if (fb0) {
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        } else if (fb0) {
        Thought lo0 = Thought127.getInstance(ad2, ad3, ad4, fd0);
        Thought lo1 = Thought364.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
if(fo0 != null){
          fo0.m3(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
        Output.points[0][3] += ad2;
        boolean lb2 = true;
        double ld3 = 59.19207963230648;
        fb0 = ad2 > ad3;
        fb1 = ad4 > fd0;
        boolean lb4 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb4, fb0, fb1);
}
        boolean lb5 = false;
if(fo1 != null){
          fd1 = fo1.m3();
}
        lb2 = lb4 || lb5;
        ld3 = ad1 + ad2;
        ad3 = ad4 + fd0;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, ld3, ad1, ad2, fb0, fb1, lb2, lb4);
}
if(fo1 != null){
          ad3 = fo1.m3(lb5, fb0, fb1, lb2);
}
        lb4 = ad4 < fd0;
        fd1 = ld3 - ad1;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
}
Thought.STACK_COUNTER++;
return ad4;
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
    boolean lb0 = false;
    boolean lb1 = false;
        ad1 = ad2 - ad3;
    ad4 *= -1;
    lb0 = fd0 < fd1;
    boolean lb2 = true;
    lb1 = ad1 > ad2;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
    lb2 = !ab1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb3 = true;
    ab1 = ab2 || ab3;
    fd1 *= -1;
if(fo1 != null){
      ab4 = fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, lb3, ab1, ab2);
}
if(fo0 != null){
      fo0.m2();
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought278.getInstance(fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    if (fb1) {
if(ao1 != null){
          fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
        double ld1 = 61.666156872178036;
        ld1 *= -1;
        boolean lb2 = false;
        lb2 = fd0 < fd1;
        fb0 = !fb1;
        ld1 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld1, fd0, lb2, fb0, fb1, lb2);
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, lb2, fb0);
}
if(ao2 != null){
          ao2.m2();
}
        fd1 = ld1 - fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1, fb1, lb2, fb0, fb1);
}
if(ao3 != null){
          lb2 = ao3.m2(fb0, fb1, lb2, fb0);
}
        fb1 = ld1 > fd0;
if(ao4 != null){
          lb2 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(fd1, ld1, fd0, fd1);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld1);
}
        double ld3 = 188.93275883261882;
if(ao4 != null){
          ao4.m3(ld3, fd0, fd1, ld1, fb1, lb2, fb0, fb1);
}
        lb2 = !fb0;
}
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
    double ld0 = 79.43178036239152;
    double ld1 = 906.4297982607794;
    fb0 = ld0 < ld1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld2 = 757.2993716946395;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = ld2 < ad1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = fd1 < ld0;
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}

Thought.STACK_COUNTER++;
return ld1;
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
    ab2 = ab3 && ab4;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    Thought lo0 = Thought382.getInstance(fd0, fd1, fd0, fd1);
    Thought lo1 = Thought179.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    ab1 = ab2 && ab3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
    boolean lb2 = false;
    lb2 = fd1 < fd0;
    ab1 = fd1 < fd0;
    boolean lb3 = true;
    ab1 = fd1 > fd0;
    ab2 = ab3 || ab4;
    fd1 = fd0 + fd1;
    Output.points[0][4] += fd0;

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
    Thought lo0 = Thought30.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
    Thought lo1 = Thought325.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    ab2 = ab3 || ab4;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
    fb0 = ad3 < ad4;
    fd0 = fd1 - ad1;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    Output.points[0][5] += fd1;
    Thought lo2 = Thought118.getInstance();
    ab2 = !ab3;
        for(int i0=0; i0<10; i0++){
        ab4 = fb0 && fb1;
if(ao2 != null){
          ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
        fb1 = !ab1;
        boolean lb3 = false;
        double ld4 = 862.030114478289;
        ad4 = fd0 - fd1;
if(ao1 != null){
          ld4 = ao1.m3(ab1, ab2, ab3, ab4);
}
        double ld5 = 704.9954660046085;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(ld5, ad1, ad2, ad3);
}
        Output.points[0][6] -= ad4;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld4, ld5);
}
        double ld6 = 664.2579421831324;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[0][7] -= fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[0][8] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    Thought lo2 = Thought220.getInstance(lb0, lb1, fb0, fb1);
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;

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
    ab2 = ab3 || ab4;
    fd1 *= -1;
        fd0 = fd1 - fd0;
    Output.points[1][0] += fd1;
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought234.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    ab4 = fd0 < fd1;
    fb0 = fb1 && ab1;
    double ld1 = 389.44048207491545;
    ld1 *= -1;
    Output.points[1][1] += fd0;
    ab2 = ab3 || ab4;
    fd1 = ld1 - fd0;
    fb0 = fd1 > ld1;
    fb1 = !ab1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    double ld2 = 179.55941294458037;
    Output.points[1][2] -= ld1;

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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought193.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ad1;
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
}
    fb1 = fd0 < fd1;
    Thought lo2 = Thought354.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
    fb0 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3();
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
}

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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(ab1, ab2, ab3, ab4);
}
    double ld0 = 116.92538029682005;
    double ld1 = 262.1665800767587;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ld0 *= -1;
    boolean lb2 = false;
    boolean lb3 = false;
if(fo0 != null){
      ld1 = fo0.m3(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, ab4, fb0, fb1, lb2);
}
if(fo0 != null){
      ad4 = fo0.m3(lb3, ab1, ab2, ab3);
}
    Output.points[1][3] += fd0;

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
    fd1 = fd0 - fd1;
    double ld0 = 918.8896408547396;
    fb1 = ld0 < fd0;
    if (fb0) {
        fd1 = ld0 + fd0;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0);
}
        fb1 = !fb0;
        boolean lb1 = false;
        fd1 = ld0 + fd0;
        fb0 = fd1 > ld0;
        for(int i0=0; i0<10; i0++){
            double ld2 = 182.41727271519665;
}}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    Output.points[1][4] -= ad2;
if(ao1 != null){
      fb0 = ao1.m2(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    fb0 = ad3 < ad4;
    Thought lo1 = Thought106.getInstance(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
    ad3 = ad4 + fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
    Output.points[1][5] -= fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    double ld2 = 898.181981779937;
    Thought lo3 = Thought394.getInstance(lb0, fb0, fb1, lb0);

Thought.STACK_COUNTER++;
return ao1;
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
    ab2 = ab3 || ab4;
    Output.points[1][6] += fd0;
    double ld0 = 597.1156356211604;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && ab1;
if(ao2 != null){
      ab2 = ao2.m2(fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
    boolean lb1 = false;
    ab2 = fd0 > fd1;
    ld0 *= -1;

Thought.STACK_COUNTER++;
return ao2;
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
    ad2 = ad3 + ad4;
if(ao1 != null){
      ab2 = ao1.m2(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        ab1 = ad3 < ad4;
        ab2 = fd0 < fd1;
        ad1 = ad2 - ad3;
        ab3 = !ab4;
        fb0 = !fb1;
        ab1 = ad4 > fd0;
if(ao2 != null){
          ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
        Thought lo0 = Thought93.getInstance();
        }
    double ld1 = 904.303453968538;
    double ld2 = 624.9723890231173;
    ab1 = ad4 < fd0;
    fd1 = ld1 - ld2;
    ad1 *= -1;
    ab2 = ad2 > ad3;
    ab3 = !ab4;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      ld2 = fo1.m3(fb1, ab1, ab2, ab3);
}
    Output.points[1][7] += ad1;
    ab4 = fb0 && fb1;
    for(int i1=0; i1<10; i1++){
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0);
}
        ab1 = ab2 || ab3;
        ab4 = fb0 || fb1;
}
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
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    Output.points[1][8] += fd0;
    Thought lo0 = Thought293.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
        boolean lb1 = false;
    boolean lb2 = false;
    fd0 *= -1;
    lb1 = !lb2;
    double ld3 = 442.07531571102646;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld3, fd0, fd1, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fo0.m1();
}
    ld3 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, fb0, fb1, lb1, lb2);
}
    fb0 = fd0 < fd1;
    fb1 = lb1 || lb2;
    ld3 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, lb2);
}
    Thought lo4 = Thought256.getInstance(fo0, fo1, fo0, fo1);
    Thought lo5 = Thought136.getInstance(ld3, fd0, fd1, ld3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
}
        fd1 *= -1;

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
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
        lb0 = fd1 < fd0;
if(fo0 != null){
          fo0.m1();
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought196.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    Thought lo2 = Thought75.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);

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
    fb1 = fd1 < fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought11.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    double ld1 = 633.059415666335;
    boolean lb2 = false;
    fd0 *= -1;
    fb0 = fd1 < ld1;
    Output.points[2][0] -= fd0;
    fb1 = !lb2;
    fb0 = fb1 && lb2;
    fd1 = ld1 - fd0;
    boolean lb3 = true;
    fd1 = ld1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    boolean lb4 = true;
    lb3 = lb4 && fb0;
    fb1 = !lb2;
    lb3 = ld1 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, lb4, fb0, fb1, lb2);
}
if(fo1 != null){
      fo1.m3(lb3, lb4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld5 = 836.9015146858565;
if(fo0 != null){
      fo0.m1(ld1, ld5, fd0, fd1);
}
    lb2 = lb3 && lb4;
    fb0 = ld1 > ld5;
    fd0 = fd1 + ld1;

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
