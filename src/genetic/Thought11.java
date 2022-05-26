package genetic;
import java.util.ArrayList;
class Thought11 extends Thought{
private static ArrayList<Thought11> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 307.5731899140194;
private double fd1 = 1.8087398552979237;
private Thought fo0 = null;
private Thought fo1 = null;
Thought11 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought11 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought11 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought11 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought11 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought11 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought11 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought11 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought11 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld0 = 89.27169517313654;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
        ld0 = fd0 - fd1;
    boolean lb1 = true;
if(fo0 != null){
      fb0 = fo0.m2(ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
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
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought12.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
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
        fb0 = ad1 < ad2;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    fb0 = ad2 > ad3;
    fb1 = ad4 > fd0;
    boolean lb1 = true;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    lb0 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
    Thought lo2 = Thought8.getInstance(ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 + ad3;
    lb1 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ad1, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m2();
}
    Output.points[0][2] -= fd1;

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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 && ab2;
    ad1 = ad2 - ad3;
    ab3 = !ab4;
    fb0 = !fb1;
    ab1 = !ab2;
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
    Thought lo1 = Thought10.getInstance(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
    double ld2 = 473.6493042598089;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
        boolean lb0 = true;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, lb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(ao2 != null){
      lb0 = ao2.m2(lb1, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    lb1 = !fb0;
    fb1 = lb0 || lb1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
        fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    if (fb1) {
        lb0 = !lb1;
        } else if (fb0) {
        double ld2 = 660.8260439736165;
        fb1 = fd0 > fd1;
        double ld3 = 573.2832148705322;
        lb0 = lb1 || fb0;
        Thought lo4 = Thought2.getInstance(ld2, ld3, fd0, fd1, fb1, lb0, lb1, fb0);
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
    Output.points[0][3] += ad1;
    ad2 *= -1;
    fb1 = fb0 && fb1;
    Output.points[0][4] += ad3;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    double ld0 = 434.08817906649125;
    boolean lb1 = false;
    Thought lo2 = Thought8.getInstance();
    boolean lb3 = true;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, lb1, lb3, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(lb1, lb3, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      lb3 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ld0, ad1, ad2, fb0, fb1, lb1, lb3);
}
    Output.points[0][5] += ad3;
    fb0 = ad4 > fd0;

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
    ab2 = !ab3;
if(ao1 != null){
      ab4 = ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
    fd1 *= -1;
    double ld0 = 136.40618450403016;
    Output.points[0][6] += ld0;
    ab3 = fd0 > fd1;
    ab4 = ld0 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao2.m3(fb1, ab1, ab2, ab3);
}
    Output.points[0][7] -= ld0;
    fd0 *= -1;
    Thought lo1 = Thought15.getInstance(fd1, ld0, fd0, fd1);
    ab4 = ld0 > fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ld0 = ao2.m3(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
    ld0 *= -1;
    ab1 = fd0 < fd1;
    ab2 = ld0 < fd0;

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
    ab1 = !ab2;
if(ao2 != null){
      ao2.m1();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    ab1 = ad1 < ad2;
    ad3 = ad4 - fd0;
        fd1 = ad1 + ad2;
    if (ab2) {
        ab3 = !ab4;
        boolean lb0 = true;
        ad3 = ad4 - fd0;
        ab4 = fd1 < ad1;
        fb0 = fb1 && lb0;
        Thought lo1 = Thought0.getInstance(ab1, ab2, ab3, ab4);
if(ao3 != null){
          ao3.m2(ad2, ad3, ad4, fd0);
}
        boolean lb2 = false;
        fd1 = ad1 - ad2;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
        Thought lo3 = Thought6.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
        boolean lb4 = true;
        lb2 = lb4 || ab1;
        ad1 = ad2 - ad3;
        boolean lb5 = false;
        ab1 = ab2 || ab3;
        ad4 *= -1;
        ab4 = fb0 && fb1;
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
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought4.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    Output.points[0][8] += fd0;
    boolean lb2 = false;
    fb0 = fd1 > fd0;

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
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    boolean lb1 = false;
    ab3 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    double ld2 = 118.61329496209241;
if(fo0 != null){
          fo0.m3();
}
    double ld3 = 518.822108987278;
    double ld4 = 589.460540546784;
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(lb1, ab1, ab2, ab3);
}
        ld4 = fd0 + fd1;
    ab4 = ld2 > ld3;
    boolean lb5 = false;
    double ld6 = 856.6211671144808;
    ab4 = !fb0;
    Thought lo7 = Thought0.getInstance(ld4, ld6, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb8 = true;
    boolean lb9 = true;
    Thought lo10 = Thought9.getInstance(fo1, fo0, fo1, fo0, ld2, ld3, ld4, ld6, ab4, fb0, fb1, lb0);

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb1 = ad3 < ad4;
    boolean lb1 = true;
    double ld2 = 562.0807523921023;
    Thought lo3 = Thought10.getInstance();
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    boolean lb4 = true;
    double ld5 = 106.60543549471706;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, lb4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld2, ld5, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo6 = Thought1.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb0, lb1, lb4);
    boolean lb7 = false;
    lb7 = fb0 || fb1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    Output.points[1][0] -= fd1;
    fb1 = ab1 || ab2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = true;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld2 = 547.1945799478328;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, ab1);
}
    double ld3 = 70.10229810665494;
    ab2 = ab3 || ab4;
    double ld4 = 62.75150601144326;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld2, ld3, ld4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld0 = 811.3539386643866;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
        double ld1 = 495.36249935516463;
    fb1 = fb0 || fb1;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = ad2 < ad3;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
    fb0 = fb1 || lb0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
if(ao1 != null){
          fo1 = ao1.m4(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb1);
}
        lb0 = fb0 || fb1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
        lb1 = ad2 < ad3;
        lb0 = fb0 || fb1;
if(ao3 != null){
          ao2 = ao3.m4();
}
        double ld2 = 856.7288625675253;
        lb1 = ad3 > ad4;
        lb0 = fd0 < fd1;
        ld2 = ad1 + ad2;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb1, lb0);
}
        Thought lo3 = Thought13.getInstance(fb0, fb1, lb1, lb0);
}
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
    Output.points[1][1] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ab2 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    ab4 = fd1 < fd0;
    Thought lo0 = Thought0.getInstance();
    Thought lo1 = Thought11.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
if(ao2 != null){
      ao2.m1(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    ab1 = ab2 || ab3;
    fd1 *= -1;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
        ab4 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    double ld2 = 619.3765709141419;
    fd0 = fd1 - ld2;
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao1 != null){
      ao1.m2();
}
    boolean lb0 = false;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
    ad4 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ab4, fb0, fb1, lb0);
}
        ad1 *= -1;
        ab1 = !ab2;
if(ao4 != null){
          ad2 = ao4.m3(ad3, ad4, fd0, fd1);
}
        ad1 *= -1;
        Output.points[1][2] += ad2;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3);
}
        boolean lb1 = false;
        ad3 = ad4 + fd0;
        Thought lo2 = Thought15.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought10.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
        fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Output.points[1][3] += fd0;
if(fo1 != null){
      fo1.m1();
}
    boolean lb2 = false;
    double ld3 = 55.94544083804875;
    double ld4 = 849.7642138202581;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb2, fb0, fb1);
}
    double ld5 = 738.5981297840056;

Thought.STACK_COUNTER++;
return ld4;
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
if(fo0 != null){
      fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld0 = 646.1256936236291;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      ab4 = fo0.m2();
}
    fb0 = fb1 && ab1;
    double ld1 = 255.37603660299752;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ab1 = !ab2;
if(fo1 != null){
      fd1 = fo1.m3(ld0, ld1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Thought lo0 = Thought16.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        lb1 = fb0 || fb1;
        Output.points[1][4] += fd0;
        lb1 = fd1 < ad1;
        fb0 = !fb1;
        Thought lo2 = Thought3.getInstance();
        Thought lo3 = Thought0.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
        fb1 = lb1 || fb0;
        fb1 = lb1 || fb0;
        double ld4 = 104.38642232647585;
        ad1 = ad2 + ad3;
if(fo1 != null){
          ad4 = fo1.m3(fd0, fd1, ld4, ad1);
}
        Output.points[1][5] += ad2;
        fb1 = ad3 < ad4;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    double ld0 = 565.3474936717695;
    ld0 = ad1 + ad2;
    boolean lb1 = false;
    lb1 = ad3 > ad4;
    ab1 = !ab2;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          ad4 = fo1.m3(fd0, fd1, ld0, ad1, lb1, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
return ad2;
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
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    double ld1 = 129.52964873065318;
    fd0 *= -1;
    fd1 = ld1 + fd0;
    lb0 = fb0 && fb1;
        lb0 = fd1 > ld1;
    fd0 *= -1;
    fb0 = fb1 && lb0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fb1 = ad2 < ad3;
if(ao2 != null){
      ao2.m2();
}
    fb0 = ad4 > fd0;
    fb1 = fd1 < ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    fb0 = ad2 < ad3;
    if (fb1) {
        fb0 = fb1 || fb0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
        fb1 = ad4 < fd0;
        fb0 = fb1 || fb0;
if(ao3 != null){
          fd1 = ao3.m3(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
          fb1 = ao4.m2(ad1, ad2, ad3, ad4);
}
        boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        double ld1 = 144.95225818444285;
        lb0 = ad4 < fd0;
        fb0 = fd1 > ld1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
        double ld2 = 205.19495273688375;
        ad4 *= -1;
        Output.points[1][6] -= fd0;
if(fo0 != null){
          fo0.m2(fd1, ld1, ld2, ad1, lb0, fb0, fb1, lb0);
}
        fb0 = !fb1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
        boolean lb3 = false;
}
Thought.STACK_COUNTER++;
return ad2;
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
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 - fd0;
    lb0 = !ab1;
    ab2 = ab3 && ab4;
    fb0 = fd1 > fd0;
    fb1 = lb0 || ab1;
    double ld1 = 436.36218800082787;
    fd0 = fd1 + ld1;
    ab2 = ab3 || ab4;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    double ld0 = 963.1251141173809;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
    ld0 = ad1 + ad2;
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, ad1, ad2);
}
    double ld1 = 826.0225953481234;
    Output.points[1][7] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
}
    ab3 = ab4 && fb0;
    fb1 = ld1 > ad1;
    ad2 = ad3 - ad4;
    Thought lo2 = Thought14.getInstance();
    Thought lo3 = Thought7.getInstance(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
    Thought lo4 = Thought10.getInstance(fb0, fb1, ab1, ab2);
    boolean lb5 = true;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Thought lo0 = Thought8.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    double ld1 = 148.11442207132126;
    boolean lb2 = true;
    Output.points[1][8] += ld1;
    lb2 = !fb0;
    double ld3 = 675.1456726598991;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = ld3 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ld3, fd0, lb2, fb0, fb1, lb2);
}
    fd1 = ld1 + ld3;
    fb0 = !fb1;
    lb2 = fb0 && fb1;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ld3, lb2, lb4, fb0, fb1);
}
    Thought lo5 = Thought14.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld3);
    fd0 = fd1 + ld1;

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd1 *= -1;
    boolean lb0 = true;
    Output.points[2][0] -= fd0;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2();
}
    lb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
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
    fb1 = !fb0;
    Thought lo0 = Thought3.getInstance(fb1, fb0, fb1, fb0);
    fb1 = ad2 < ad3;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        lb1 = ad4 < fd0;
        double ld2 = 602.9411509774279;
        fb0 = !fb1;
        boolean lb3 = false;
        lb1 = lb3 || fb0;
        double ld4 = 402.8241560890981;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ld2);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld4, ad1, ad2, ad3, fb1, lb1, lb3, fb0);
}
        Output.points[2][1] -= ad4;
        fb1 = !lb1;
        fd0 = fd1 + ld2;
        boolean lb5 = false;
        lb3 = ld4 < ad1;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb5, fb0, fb1, lb1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, ld2, ld4, ad1);
}
if(fo1 != null){
          fo1.m3();
}
        lb3 = !lb5;
        Output.points[2][2] += ad2;
        fb0 = ad3 > ad4;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, lb3, lb5);
}
        fb0 = fd0 > fd1;
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
    double ld0 = 143.09863299936123;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    ld0 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    double ld1 = 629.4752347854859;
    if (ab2) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        boolean lb2 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
        Output.points[2][3] -= ad1;
        boolean lb3 = false;
        ab3 = !ab4;
        fb0 = ad2 < ad3;
if(fo0 != null){
          fo1 = fo0.m4();
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 - fd1;
    boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    fb1 = lb0 && lb1;

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
    boolean lb0 = false;
    lb0 = ad1 > ad2;
    boolean lb1 = true;
    boolean lb2 = true;
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb3 = false;
    Thought lo4 = Thought13.getInstance(ao3, ao4, fo0, fo1, lb1, lb2, lb3, fb0);
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, lb1, lb2);
}
    boolean lb5 = false;
    boolean lb6 = true;
    double ld7 = 277.0208001226976;
    double ld8 = 384.44413317731977;
if(ao3 != null){
      lb3 = ao3.m2(ad1, ad2, ad3, ad4);
}
    lb5 = fd0 < fd1;
    ld7 *= -1;

Thought.STACK_COUNTER++;
return ao4;
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
    ab2 = !ab3;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    Thought lo0 = Thought9.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
if(fo0 != null){
      ab2 = fo0.m2();
}
    ab3 = fd1 > fd0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb0 = fb1 && lb1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb2 = false;
    Thought lo3 = Thought14.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb2, ab1, ab2, ab3);
    fd1 = fd0 - fd1;
    ab4 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, lb1, lb2, ab1, ab2);
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
    Thought lo0 = Thought10.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
    double ld1 = 151.71402384169915;
    ab1 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3();
}
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought17.getInstance(fb1, ab1, ab2, ab3);
if(fo1 != null){
      ab4 = fo1.m2(fd0, fd1, ld1, ad1);
}
    ad2 *= -1;
    Thought lo3 = Thought19.getInstance(ao1, ao2, ao3, ao4);
    boolean lb4 = true;
    Thought lo5 = Thought14.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb4);
    Output.points[2][4] += ld1;
    double ld6 = 894.7118291570356;
    boolean lb7 = true;
if(ao3 != null){
      lb7 = ao3.m2(ld6, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    Thought lo8 = Thought8.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld1);
    ld6 = ad1 - ad2;
    fb0 = fb1 || lb4;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb9 = false;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, lb7, lb9, ab1, ab2);
}
    Output.points[2][5] += ad3;
    ab3 = ab4 && fb0;
    ad4 = fd0 + fd1;
    double ld10 = 547.2209434353398;
    fb1 = lb4 || lb7;
    lb9 = ld1 < ld6;

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
    Thought lo0 = Thought7.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    Thought lo2 = Thought14.getInstance(fd0, fd1, fd0, fd1);
    Thought lo3 = Thought8.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    boolean lb4 = true;
    Thought lo5 = Thought16.getInstance(fd1, fd0, fd1, fd0, lb1, lb4, fb0, fb1);
    fd1 = fd0 - fd1;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb6 = false;
    fd1 *= -1;
    fd0 *= -1;
    lb4 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb6, fb0, fb1, lb1);
}
    fd1 = fd0 + fd1;
    lb4 = fd0 > fd1;
    boolean lb7 = true;
if(fo0 != null){
      fd0 = fo0.m3(lb6, lb7, fb0, fb1);
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
    fb0 = fd1 > fd0;
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
    Output.points[2][6] -= fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    Output.points[2][7] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fd0 *= -1;
        double ld0 = 144.20618287706216;
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
    ld0 = fd0 - fd1;
    Output.points[2][8] += ld0;
    fd0 *= -1;
        boolean lb1 = true;
if(fo0 != null){
      fo0.m1(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fb1 = ld0 > fd0;
    double ld2 = 833.7091113227339;
    Output.points[3][0] += fd0;
    boolean lb3 = false;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld2, fd0);
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
        boolean lb0 = true;
    fd1 = fd0 - fd1;
        Thought lo1 = Thought3.getInstance();
    boolean lb2 = false;
    Output.points[3][1] -= fd0;
    double ld3 = 468.3860001805938;
    Thought lo4 = Thought19.getInstance(fo1, fo0, fo1, fo0, lb0, lb2, fb0, fb1);
if(fo1 != null){
      fo1.m2(lb0, lb2, fb0, fb1);
}
    lb0 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, fd0);
}
    double ld5 = 417.96974876490464;

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
